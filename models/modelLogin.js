let usuarios = [
    {user:"sebas", password:"1234", roll:"admin", nombre: "Sebastián", apellido: "Vasquez", correo: "sebas@correo.com", documento: "1", radioSexo: "Hombre", telefono: "11111", tipoDocumento: "cc" },
    {user:"johan", password:"1234", roll:"admin", nombre: "Sebastián", apellido: "Vasquez", correo: "sebas@correo.com", documento: "1", radioSexo: "Hombre", telefono: "11111", tipoDocumento: "cc" },
    {user:"sebastian", password:"1234", roll:"admin", nombre: "Sebastián", apellido: "Vasquez", correo: "sebas@correo.com", documento: "1", radioSexo: "Hombre", telefono: "11111", tipoDocumento: "cc" },
    {user:"jose", password:"1234", roll:"admin", nombre: "Sebastián", apellido: "Vasquez", correo: "sebas@correo.com", documento: "1", radioSexo: "Hombre", telefono: "11111", tipoDocumento: "cc" },
];

document.addEventListener('DOMContentLoaded', functionArray)

function functionArray() {
    let users = JSON.parse(localStorage.getItem('registros')) || [];
    if( users.length === 0 ) {
        localStorage.setItem('registros', JSON.stringify(usuarios));
        return;
    }
    return users
}


export let users = functionArray();