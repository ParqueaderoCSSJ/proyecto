import { registros } from "../models/modelRegistro.js";

const btnGuardar = document.querySelector('#btnGuardar');

btnGuardar.addEventListener('click', validacionDeCampos)

function validacionDeCampos(e) {
  e.preventDefault();
  
  const tipoDocumento = document.querySelector('#tipoDocumento').value;
  const documento = document.querySelector('#Documento').value;
  const nombre = document.querySelector('#Nombre').value;
  const radioSexo = document.querySelector('input[name=sexo]:checked');
  const apellido = document.querySelector('#Apellido').value;
  const telefono = document.querySelector('#Telefono').value;
  const correo = document.querySelector('#Correo').value;
  const rol = document.querySelector('#Rol').value;
  const cargo = document.querySelector('#cargo').value;
  const usuario = document.querySelector('#Usuario').value;
  const contrasena = document.querySelector('#Contrasena').value;
  const confirmar = document.querySelector('#Confirmar').value;
  
  if(tipoDocumento !== '' && documento !== '' && nombre !== '' && radioSexo !== null && apellido !== '' && telefono !== '' && correo !== '' && rol !== '' && cargo !== '' && usuario !== '' && contrasena !== '' && confirmar !== '') {
    if( contrasena === confirmar ) {
      const usuarioObj = {
        tipoDocumento,
        documento,
        nombre,
        radioSexo,
        apellido,
        telefono,
        correo,
        rol,
        cargo,
        usuario,
        contrasena,
        confirmar
      }
      agregarUsuario(usuarioObj);
    } else {
      Swal.fire({
        title: "Error!",
        text: "Las contraseñas deben de ser iguales",
        icon: "error"
      });
    }
  } else {
    Swal.fire({
      title: "Error!",
      text: "Complete todos los campos",
      icon: "error"
    });
  }

}