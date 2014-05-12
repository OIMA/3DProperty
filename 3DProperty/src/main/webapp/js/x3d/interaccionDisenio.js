/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$("#divImagenes").hide();
$("#divPromotor").hide();
var maximizado = false;
$("#botonMaximizar").click(
        function() {
            if (!maximizado) {
                $("#instrucciones").hide('slow');
                $("#canvasX3D").hide('slow');
                $("#canvasX3D").attr('class', 'col-md-12 column');
                $("#instrucciones").attr('class', '');
                $("x3d").css('height', '100%');
                $("x3d").css('width', '100%');
                $("#canvasX3D").show('slow');
                $("#botonMaximizar").delay(500).attr('class', 'btn btn-md btn-default');
                $("#botonMaximizar").delay(500).text('Restaurar');
                $("#container").attr('class', '');
                $(".overLogo").css('margin', '40% auto auto 90%');
                maximizado = true;
            } else {
                $("#container").attr('class', 'container');
                $("#botonMaximizar").text('Maximizar');
                $("#botonMaximizar").attr('class', 'btn btn-xs btn-danger');
                $("#canvasX3D").hide('slow');
                $("x3d").css('height', '500px');
                $("x3d").css('width', '100%');
                $("#instrucciones").attr('class', 'col-md-4 column');
                $("#canvasX3D").attr('class', 'col-md-8 column');
                $("#canvasX3D").show('slow');
                $("#instrucciones").delay(1000).show('slow');
                maximizado = false;
            }
        });

$("#rating-id").raty({
    score: function() {
        return $(this).attr('data-score');
    },
    click: function(score, evt) {
        alert('ID: ' + $(this).attr('id') + "\nscore: " + score + "\nevent: " + evt);

    },
    cancel: true,
    half: true,
    size: 50
});
$("#show-rating").raty({
    score: function() {
        return $(this).attr('data-score');
    },
    click: function(score, evt) {
        alert('ID: ' + $(this).attr('id') + "\nscore: " + score + "\nevent: " + evt);

    },
    cancel: 'true',
    half: 'false',
    size: 50,
    readOnly: true
});
$('#thumbs').delegate('img', 'click', function() {
    $('#largeImage').attr('src', $(this).attr('src').replace('thumb', 'large'));
    $('#description').html($(this).attr('alt'));
});
$("#tabDisenio").click(function() {
    $("#instrucciones").delay(500).show('slow');
    $("#divImagenes").hide('slow');
    $("#divPromotor").hide('slow');
});

$("#tabImagenes").click(function() {
    $("#instrucciones").hide('slow');
    $("#divPromotor").hide('slow');
    $("#divImagenes").delay(500).show('slow');
});

$("#divPromotor").click(function(){
    $("#instrucciones").hide('slow');
    $("#divImagenes").hide('slow');
    $("#divPromotor").delay(500).show('slow');
});