/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
(function(){
 
 // we set the default parameters
 // @namespace LKS top level namespace
 
 LKS={};
 LKS.params={};
 LKS.params.stars=5;
 
 //url to the webservice
 
 LKS.params.url='http://www.jqueryload.com/examples/stars/test.php?callback=LKS.draw';
 
 LKS.start= function(){
 
 //jsonp call
 
 $.jsonp( {'url':LKS.params.url});
 
 }
 
 // in this method you should include the call to your sever in order to save the new vote.
 
 LKS.sendVote = function (id,vote)
 {
 alert("Star selected: "+(vote)+", Element id: "+id);// change this line in order to send your vote to your server.
 }
 
 // callback function
 LKS.draw = function(data){
 
 // the values for every div are asigned on this each
 
 $('.stars').each(function(index,item){
 var id=$(item).attr('itemid');
 $(item).attr('value',data[id]);
 });
 
 // we add the stars as a link elements and we set the dafault clases
 
 $('.stars').each(function(index,item){
 var n;
 var value= $(item).attr('value');
 for (n=0;n<LKS.params.stars;n++)
 {
 var star=$('<a>');
 star.addClass('star');
 star.attr('href','javascript:void(0)');
 star.attr('vote',n+1);
 if (n<=value)
 {star.addClass('point');}
 $(item).append(star);
 }
 });
 
 // events for over behaivor, are set here
 
 $('.stars a').bind('mouseover',function(data){
 var childs=$(data.target).parent().children();
 childs.each(function(index,item){
 
 if ($(this).index() <= $(data.target).index())
 {$(item).addClass('hover');}
 else
 {$(item).removeClass('hover');}
 
 })
 })
 
 // on mouse out we back to the previous status
 
 $('.stars a').bind('mouseout',function(data){
 var childs=$(data.target).parent().children();
 $(childs).removeClass('hover');
 });
 
// we attached the click event to the star
       $('.stars a').bind('click',function(){
              var item=$(this).parent().attr('itemid');
              var vote=$(this).attr('vote');
              LKS.sendVote(item,vote);
       });
 
 }
}());