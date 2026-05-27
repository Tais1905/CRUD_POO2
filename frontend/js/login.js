function fazerLogin() {
  const usuario = document.getElementById("usuario").value;
  const senha = document.getElementById("senha").value;

  if (usuario === "admin" && senha === "123") {
    localStorage.setItem("logado", "sim");
    window.location.href = "index.html";
  } else {
    alert("Usuário ou senha incorretos!");
  }
}

function sair() {
  localStorage.removeItem("logado");
  window.location.href = "login.html";
}