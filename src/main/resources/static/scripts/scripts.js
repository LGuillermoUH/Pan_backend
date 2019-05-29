$(document).ready(function(){
  
  $('#listaProductos div').click(function(){
    document.getElementById("selectedProduct").style.visibility = "visible";
    var idSelect = $(this).attr('id');
    idSelect = idSelect.substring(11,12);
    var nombrePS = "nombreP"+idSelect;
    var precioPS = "precioP"+idSelect;
    var imgPS = "imgP"+idSelect;
    document.getElementById("nombrePS").innerHTML = document.getElementById(nombrePS).textContent;
    document.getElementById("precioPS").innerHTML = document.getElementById(precioPS).textContent;
    document.getElementById("imgPS").src = document.getElementById(imgPS).src;
    document.getElementById("descripcionPS").innerHTML = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatum, labore numquam pariatur fugit harum voluptate quisquam saepe possimus provident, minus nemo nisi dolore magnam ducimus, fuga expedita vel explicabo perferendis non ex.";
    document.getElementById("boxAddCarrito").innerHTML = "<p> <label>Cantidad:</label> <input type='text' placeholder='1' class='form-control' id='txtPrecio"+idSelect+"' width='5'> </p> <p> <a class='btn btn-primary btn-xs' href='/carrito/"+idSelect+"'>Agregar</a> </p>";

  });



});