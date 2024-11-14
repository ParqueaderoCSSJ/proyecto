document.addEventListener('DOMContentLoaded', functionArray)

function functionArray() {
  let entrada = JSON.parse(localStorage.getItem('vehiculosEntrada')) || [];
  return entrada
}

export let entrada = functionArray();