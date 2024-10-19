import { users } from "../models/modelLogin.js";
document.getElementById("login").addEventListener('submit', function (event) {
    event.preventDefault()
    access();
})
function access() {
    let userLogin = (document.getElementById("usuario").value)
    let password = document.getElementById("password").value

    if (users.find(user => user.user === userLogin.toLowerCase())) {
        let row = users.findIndex(user => user.user === userLogin.toLowerCase())
        if (users[row].password == password.toLowerCase()) {
            switch (users[row].roll) {
                case 'admin':
                    window.location.href = './views/admin/disponibilidad.html'
                    break;
                case 'usuario':
                    window.location.href = './views/usuario/disponibilidad.html'
                    break;
                case 'operario':
                    window.location.href = './views/operario/disponibilidad.html'
                    break;
            }
        } else {
            var msg = "La contraseña es incorrecta"
            alertSuccess(msg, false)
        }
    } else {
        var msg = "El usario no existe"
        alertSuccess(msg, false)
    }

}