let fornecedores = JSON.parse(localStorage.getItem("fornecedores")) || [];
let mercadorias = JSON.parse(localStorage.getItem("mercadorias")) || [];

function salvarListaFornecedores() {
  localStorage.setItem("fornecedores", JSON.stringify(fornecedores));
}

function listarFornecedores() {
  const tabela = document.getElementById("tabelaFornecedores");

  if (!tabela) return;

  tabela.innerHTML = "";

  fornecedores.forEach((fornecedor, index) => {
    tabela.innerHTML += `
      <tr>
        <td>${fornecedor.nome}</td>
        <td>${fornecedor.contato}</td>
        <td>${fornecedor.endereco}</td>
        <td>
          <button class="btn-ver" onclick="verMercadoriasFornecedor('${fornecedor.nome}')">Mercadorias</button>
          <button class="btn-editar" onclick="editarFornecedor(${index})">Editar</button>
          <button class="btn-excluir" onclick="excluirFornecedor(${index})">Excluir</button>
        </td>
      </tr>
    `;
  });
}

function salvarFornecedor(event) {
  event.preventDefault();

  const novoFornecedor = {
    nome: document.getElementById("nome").value,
    contato: document.getElementById("contato").value,
    endereco: document.getElementById("endereco").value
  };

  fornecedores.push(novoFornecedor);
  salvarListaFornecedores();

  alert("Fornecedor cadastrado com sucesso!");
  window.location.href = "listar-fornecedores.html";
}

function editarFornecedor(index) {
  window.location.href = `editar-fornecedor.html?id=${index}`;
}

function carregarFornecedorParaEditar() {
  const params = new URLSearchParams(window.location.search);
  const id = params.get("id");
  const fornecedor = fornecedores[id];

  document.getElementById("id").value = id;
  document.getElementById("nome").value = fornecedor.nome;
  document.getElementById("contato").value = fornecedor.contato;
  document.getElementById("endereco").value = fornecedor.endereco;
}

function atualizarFornecedor(event) {
  event.preventDefault();

  const id = document.getElementById("id").value;

  fornecedores[id] = {
    nome: document.getElementById("nome").value,
    contato: document.getElementById("contato").value,
    endereco: document.getElementById("endereco").value
  };

  salvarListaFornecedores();

  alert("Fornecedor atualizado com sucesso!");
  window.location.href = "listar-fornecedores.html";
}

function excluirFornecedor(index) {
  if (confirm("Deseja excluir este fornecedor?")) {
    fornecedores.splice(index, 1);
    salvarListaFornecedores();
    listarFornecedores();
  }
}

function verMercadoriasFornecedor(nomeFornecedor) {
  window.location.href = `mercadorias-fornecedor.html?fornecedor=${nomeFornecedor}`;
}

function listarMercadoriasDoFornecedor() {
  const params = new URLSearchParams(window.location.search);
  const fornecedorSelecionado = params.get("fornecedor");

  document.getElementById("nomeFornecedor").innerText =
    `Fornecedor: ${fornecedorSelecionado}`;

  const tabela = document.getElementById("tabelaMercadoriasFornecedor");
  tabela.innerHTML = "";

  mercadorias.forEach(mercadoria => {
    if (
      mercadoria.fornecedor === fornecedorSelecionado &&
      mercadoria.quantidade > 0
    ) {
      tabela.innerHTML += `
        <tr>
          <td>${mercadoria.nome}</td>
          <td>${mercadoria.descricao}</td>
          <td>${mercadoria.validade}</td>
          <td>${mercadoria.quantidade}</td>
        </tr>
      `;
    }
  });
}

listarFornecedores();