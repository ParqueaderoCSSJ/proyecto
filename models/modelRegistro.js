document.addEventListener('DOMContentLoaded', functionArray)

function functionArray() {
  let registros = JSON.parse(localStorage.getItem('registros')) || [];
  return registros
}

export let registros = functionArray();