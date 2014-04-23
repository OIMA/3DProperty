/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(".botonEliminar").click(function() {
    var id = $(this).attr("value");
    alert(id);
    $.post("EliminarEstado.action",
    {idEstado: id},
    function(json) {
        alert(json.mensajeRetorno);
    });
});
