let mercadorias = JSON.parse(localStorage.getItem("mercadorias")) || [];
let fornecedores = JSON.parse(localStorage.getItem("fornecedores")) || [];

function salvarListaMercadorias() {
  localStorage.setItem("mercadorias", JSON.stringify(mercadorias));
}

function listarMercadorias() {
  const tabela = document.getElementById("tabelaMercadorias");

  if (!tabela) return;

  tabela.innerHTML = "";

  mercadorias.forEach((mercadoria, index) => {
    if (mercadoria.quantidade > 0) {
      tabela.innerHTML += `
        <tr>
          <td>${mercadoria.nome}</td>
          <td>${mercadoria.descricao}</td>
          <td>${mercadoria.validade}</td>
          <td>${mercadoria.cadastro}</td>
          <td>${mercadoria.fornecedor}</td>
          <td>${mercadoria.quantidade}</td>
          <td>
            <button class="btn-editar" onclick="editarMercadoria(${index})">Editar</button>
            <button class="btn-excluir" onclick="excluirMercadoria(${index})">Excluir</button>
          </td>
        </tr>
      `;
    }
  });
}

function carregarFornecedoresSelect() {
  const select = document.getElementById("fornecedor");

  if (!select) return;

  select.innerHTML = '<option value="">Selecione um fornecedor</option>';

  fornecedores.forEach(fornecedor => {
    select.innerHTML += `
      <option value="${fornecedor.nome}">
        ${fornecedor.nome}
      </option>
    `;
  });
}

function salvarMercadoria(event) {
  event.preventDefault();

  const novaMercadoria = {
    nome: document.getElementById("nome").value,
    descricao: document.getElementById("descricao").value,
    validade: document.getElementById("validade").value,
    cadastro: new Date().toLocaleDateString("pt-BR"),
    fornecedor: document.getElementById("fornecedor").value,
    quantidade: Number(document.getElementById("quantidade").value)
  };

  mercadorias.push(novaMercadoria);
  salvarListaMercadorias();

  alert("Mercadoria cadastrada com sucesso!");
  window.location.href = "listar-mercadorias.html";
}

function editarMercadoria(index) {
  window.location.href = `editar-mercadoria.html?id=${index}`;
}

function carregarMercadoriaParaEditar() {
  carregarFornecedoresSelect();

  const params = new URLSearchParams(window.location.search);
  const id = params.get("id");
  const mercadoria = mercadorias[id];

  document.getElementById("id").value = id;
  document.getElementById("nome").value = mercadoria.nome;
  document.getElementById("descricao").value = mercadoria.descricao;
  document.getElementById("validade").value = mercadoria.validade;
  document.getElementById("fornecedor").value = mercadoria.fornecedor;
  document.getElementById("quantidade").value = mercadoria.quantidade;
}

function atualizarMercadoria(event) {
  event.preventDefault();

  const id = document.getElementById("id").value;

  mercadorias[id] = {
    nome: document.getElementById("nome").value,
    descricao: document.getElementById("descricao").value,
    validade: document.getElementById("validade").value,
    cadastro: mercadorias[id].cadastro,
    fornecedor: document.getElementById("fornecedor").value,
    quantidade: Number(document.getElementById("quantidade").value)
  };

  salvarListaMercadorias();

  alert("Mercadoria atualizada com sucesso!");
  window.location.href = "listar-mercadorias.html";
}

function excluirMercadoria(index) {
  if (confirm("Deseja excluir esta mercadoria?")) {
    mercadorias.splice(index, 1);
    salvarListaMercadorias();
    listarMercadorias();
    alert("Estoque recalculado e mercadoria removida!");
  }
}

carregarFornecedoresSelect();
listarMercadorias();