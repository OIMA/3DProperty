window.setInterval(function(){
    $.post(
            "consultarMensajesNoLeidosJSON.action",
            {idUsuario:$("#nombreUsuario").attr('idUsuario')},
            function(data){
                var nuevosMensajes = data.mensajeRecibidosList;
                $.each(nuevosMensajes,function(index,datos){
                    console.log(index);
                });
            }
            );
},10000);