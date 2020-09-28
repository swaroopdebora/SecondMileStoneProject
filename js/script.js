  $(document).ready(function(){
             $(".about-city").hover(function(){
                 $(this).addClass("highlight");
             }, function(){
                 $(this).removeClass("highlight");
             });
                $(".content-boxplaces").click(function(){
                 $(".content-boxplaces").animate({
                     width:'500px',
                     height:'100%'
                     }, 'fast');
                     $(".content-paraAfter").show().animate({opacity:'1'},'slow');
             });
  	       		 $(".content-boxrestuarents").click(function(){
                 $(".content-boxrestuarents").animate({
                     width:'500px',
                     height:'100%'
                     }, 'fast');
                     $(".content-restaurantsAfter").show().animate({opacity:'1'},'slow');
             });

         				 $(".content-AccHotels").click(function(){
                 $(".content-AccHotels").animate({
                     width:'500px',
                     height:'100%'
                     }, 'fast');
                     $(".content-AccAfter").show().animate({opacity:'1'},'slow');
             });
         });

function sendMail(contactForm) {
    emailjs.send("gmail", "happyjourney", {
        "from_name": contactForm.name.value,
        "from_email": contactForm.emailaddress.value,
        "textareadesc": contactForm.textareadesc.value
})
    .then(
        function(response) {
            console.log("SUCCESS", response);
        },
        function(error) {
            console.log("FAILED", error);
        }  
    );
    return false;  // To block from loading a new page
}