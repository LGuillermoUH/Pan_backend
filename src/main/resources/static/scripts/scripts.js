$(document).ready(function(){
  
  $('#listaProductos div').click(function(){
    document.getElementById("selectedProduct").style.visibility = "visible";
    var idSelect = $(this).attr('id');
    idSelect = idSelect.substring(11,13);
    var nombrePS = "nombreP"+idSelect;
    var precioPS = "precioP"+idSelect;
    var imgPS = "imgP"+idSelect;
    var descricpionP = "descripcionP"+idSelect;
    document.getElementById("nombrePS").innerHTML = document.getElementById(nombrePS).textContent;
    document.getElementById("precioPS").innerHTML = "$"+document.getElementById(precioPS).textContent;
    document.getElementById("imgPS").src = document.getElementById(imgPS).src;
    document.getElementById("descripcionPS").innerHTML = document.getElementById(descricpionP).textContent;
    document.getElementById("boxCantPanes").innerHTML = "<table> <tbody> <tr> <td colspan='3'>Cantidad:</td> </tr> <tr> <td> <input type='button' value='+' id='btnSuma' class='btn btn-secondary'> </td> <td> <input type='text' id='txtCantidad"+idSelect+"' placeholder='1' class='form-control'> </td> <td> <input type='button' value='-' id='btnSuma' class='btn btn-secondary'> </td> </tr> </tbody> </table>";
    document.getElementById("boxAddCarrito").innerHTML = "<p> <a class='btn btn-primary btn-xs' href='/carrito/"+idSelect+"'>Agregar</a> </p>";

  });
});