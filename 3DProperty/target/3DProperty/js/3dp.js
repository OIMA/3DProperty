/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//$("#tablaPropiedades").dataTable();
$(document).ready(function() {
    $('#tablaPropiedades').dataTable({
        "language": {
            "lengthMenu": ''
        }
    });
});

$("select[name=tablaPropiedades_length]").each(function() {
    $(this).hide();
});