function combo(cadena)
{
    return cadena !== -1;
}

function esCURP(cadena)
{
    return (/^[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[HM]{1}(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)[B-DF-HJ-NP-TV-Z]{3}[0-9A-Z]{1}[0-9]{1}$/.test(cadena) || cadena==='');
}

function esRFC(cadena)
{
    return (/^(([A-Z]|[a-z]|\s){1})(([A-Z]|[a-z]){3})([0-9]{6})((([A-Z]|[a-z]|[0-9]){3}))/.test(cadena) || cadena==='');
}

function fechaFormato(cadena)
{
    return /^(?:(?:0?[1-9]|1[0-9]|2[0-8])(\/|-)(?:0?[1-9]|1[0-2]))(\/|-)(?:[1-9][0-9][0-9][0-9]|[0-9][1-9][0-9][0-9]|[0-9][0-9][1-9][0-9]|[0-9][0-9][0-9][1-9])$|^(?:(?:31(\/|-)(?:0?[13578]|1[02]))|(?:(?:29|30)(\/|-)(?:0?[1,3-9]|1[0-2])))(\/|-)(?:[1-9][0-9][0-9][0-9]|[0-9][1-9][0-9][0-9]|[0-9][0-9][1-9][0-9]|[0-9][0-9][0-9][1-9])$|^(29(\/|-)0?2)(\/|-)(?:(?:0[48]00|[13579][26]00|[2468][048]00)|(?:[0-9][0-9])?(?:0[48]|[2468][048]|[13579][26]))$/.test(cadena);
}

function esEmail(cadena)
{
    return /^[a-zA-Z0-9._%+-]+@(?:[a-zA-Z0-9-]+\.)+[a-zA-Z]{2,4}/.test(cadena);
}

function soloNumeros(cadena)
{
    return /^[0-9]*$/.test(cadena);
}

function soloLetras(cadena)
{
    return /^[a-zA-Z\s]*$/.test(cadena);
}

function noNull(cadena)
{
    return cadena.length > 0;
}

function fechaFormato(cadena)
{
    return /^(?:(?:0?[1-9]|1[0-9]|2[0-8])(\/|-)(?:0?[1-9]|1[0-2]))(\/|-)(?:[1-9][0-9][0-9][0-9]|[0-9][1-9][0-9][0-9]|[0-9][0-9][1-9][0-9]|[0-9][0-9][0-9][1-9])$|^(?:(?:31(\/|-)(?:0?[13578]|1[02]))|(?:(?:29|30)(\/|-)(?:0?[1,3-9]|1[0-2])))(\/|-)(?:[1-9][0-9][0-9][0-9]|[0-9][1-9][0-9][0-9]|[0-9][0-9][1-9][0-9]|[0-9][0-9][0-9][1-9])$|^(29(\/|-)0?2)(\/|-)(?:(?:0[48]00|[13579][26]00|[2468][048]00)|(?:[0-9][0-9])?(?:0[48]|[2468][048]|[13579][26]))$/.test(cadena);
}

function pruebaFormulario(cadena, element)
{
    var classList = element.attr('class').split(/\s+/);
    $.each(classList, function(index, item) {
        if (item === 'nn')
        {
            alert('No nulo');
            bandera = noNull(cadena);
            if (!bandera) {
                return false;
            }
        }
        if (item === 'sl')
        {
            alert('Solo letras');
            bandera = soloLetras(cadena);
            if (!bandera) {
                return false;
            }
        }
        if (item === 'sn')
        {
            alert('Solo numeros');
            bandera = soloNumeros(cadena);
            if (!bandera) {
                return false;
            }
        }
        if (item === 'em')
        {
            alert('Email');
            bandera = esEmail(cadena);
            if (!bandera) {
                return false;
            }
        }
        if (item === 'ff')
        {
            alert('Fecha');
            bandera = fechaFormato(cadena);
            if (!bandera) {
                return false;
            }
        }
        if (item === 'ns')
        {
            bandera = cadena.containts('<script>');
            if (!bandera) {
                return false;
            }
        }
        if (item === 'curp')
        {
            bandera = esCURP(cadena);
            if (!bandera) {
                return false;
            }
        }
        if (item === 'rfc')
        {
            bandera = esRFC(cadena);
            if (!bandera) {
                return false;
            }
        }
        if (item === 'cc')
        {
            bandera = combo(cadena);
            if (!bandera) {
                return false;
            }
        }
    });
    return bandera;
}

$(document).ready(function()
{
    $(".vf").click(function(event)
    {
        event.preventDefault();
        var bandera = false;
        var campo;
        var inputs = $(".form").find('input');
        $.each(inputs, function(index, element)
        {
            campo = element;
            var classList = $(element).attr('class').split(/\s+/);
            if ($.inArray('campo', classList) >= 0)
            {
                $.each(classList, function(index, item)
                {
                    if (item === 'nn')
                    {
                        bandera = noNull(element.value);
                        if (!bandera) {
                            alert('Campo ' + element.name + ' es nulo');
                            return false;
                        }
                    }
                    if (item === 'sl')
                    {
                        bandera = soloLetras(element.value);
                        if (!bandera) {
                            alert('Solo letras ' + element.value + ' invalidos');
                            return false;
                        }
                    }
                    if (item === 'sn')
                    {
                        bandera = soloNumeros(element.value);
                        if (!bandera) {
                            alert('Solo numeros' + element.value + ' invalidos');
                            return false;
                        }
                    }
                    if (item === 'em')
                    {
                        alert('Email');
                        bandera = esEmail(element.value);
                        if (!bandera) {
                            return false;
                        }
                    }
                    if (item === 'ff')
                    {
                        bandera = fechaFormato(element.value);
                        if (!bandera) {
                            alert('Fecha ' + element.value + ' invalida');
                            return false;
                        }
                    }
                    if (item === 'ns')
                    {
                        bandera = element.value.containts('<script>');
                        if (!bandera) {
                            return false;
                        }
                    }
                    if (item === 'curp')
                    {
                        bandera = esCURP(element.value);
                        if (!bandera) {
                            return false;
                        }
                    }
                    if (item === 'rfc')
                    {
                        bandera = esRFC(element.value);
                        if (!bandera) {
                            return false;
                        }
                    }
                    if (item === 'cc')
                    {
                        bandera = combo(element.value);
                        if (!bandera) {
                            return false;
                        }
                    }
                });
            }
        });
        alert(bandera);
        if (!bandera){
            campo.parent().attr('class','form-group has-error');
        }else{
            campo.parent().attr('class','form-group has-success');
        }
//            event.preventDefault();
    });

    $('.campo').blur(function()
    {
        var cadena = $(this).val();
        var element = $(this);
        pruebaFormulario(cadena, element);
    });
});

//$(".vf").click(function()
//    {
//        var ff = $('.ff').val();
//        var ns = $('.ns').val();
//        var sl = $('.sl').val();
//        var sn = $('.sn').val();
//        var em = $('.em').val();
//        var cp = $('.cp').val();
//        var cu = $('.cu').val();

//        expSL = new RegExp('^[a-zA-Z\s]*$');
//        expSN = new RegExp('^[0-9]*$');
//        expFF = new RegExp('^(?:(?:0?[1-9]|1[0-9]|2[0-8])(\/|-)(?:0?[1-9]|1[0-2]))(\/|-)(?:[1-9][0-9][0-9][0-9]|[0-9][1-9][0-9][0-9]|[0-9][0-9][1-9][0-9]|[0-9][0-9][0-9][1-9])$|^(?:(?:31(\/|-)(?:0?[13578]|1[02]))|(?:(?:29|30)(\/|-)(?:0?[1,3-9]|1[0-2])))(\/|-)(?:[1-9][0-9][0-9][0-9]|[0-9][1-9][0-9][0-9]|[0-9][0-9][1-9][0-9]|[0-9][0-9][0-9][1-9])$|^(29(\/|-)0?2)(\/|-)(?:(?:0[48]00|[13579][26]00|[2468][048]00)|(?:[0-9][0-9])?(?:0[48]|[2468][048]|[13579][26]))$');
//        expEM = new RegExp('^[a-zA-Z0-9._%+-]+@(?:[a-zA-Z0-9-]+\.)+[a-zA-Z]{2,4}');
//        expCP = new RegExp('^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$');
//        expCU = new RegExp('^[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[HM]{1}(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)[B-DF-HJ-NP-TV-Z]{3}[0-9A-Z]{1}[0-9]{1}$')

//        if (!sl.match(expSL)) 
//            $('#div').html("Solo letras");
//        if (sn.match(expSN))
//            alert("Numeros validdos");
//        else
//            alert("Numeros incorrectos");
//        if (ns.contains('<script>')) 
//            alert('Sin script')
//        else
//            alert('Error contiene script')
//        if (ff.match(expFF)) 
//             alert('Fecha correcta');
//        else
//            alert("Error fecha");
//            if (expEM.test(em))
//                alert('EM OK');
//            else
//                alert('EM ERROR');
//            if (expCP.test(cp)) 
//                alert('OK CP');
//            else
//                alert('Error CP');
//            if (expCU.test(cu)) 
//                alert('CURP OK');
//            else
//                alert('CURP ERROR');
//    });