$(document).on('click', ".eliminacion", eliminar);

function eliminar(e)
{
    var row = $(this).parents('tr')[0];
    var metodo = $(e.target).attr('metodo');
    var variable = $(e.target).attr('nombre');
    var valor = $(e.target).attr('ide');
    var params = {};
    params[variable] = valor;
    $.post(metodo, params, function(response)
    {
        row.remove();
    });
}