describe('get google directions', function () {
  it("should respond with direction detail", function (done) {
       userdata = { 'body': 'Hi' };
    })
    .then(function (params) {
       expect(askDestination).toBe(googledirection.askOrigin);
       userdata = {
              'body': 'tambaram'
       };
      return askDestination(userdata);
    })
    .then(function (params) {
        expect(askDestination).toBe(googledirection.askDestination);
        userdata = {
             'body': 'egmore',
             googledirection: {
                      'origin': 'tambaram'
             }
        };
      return askDestination(userdata);
    })
    .then(function (params) {
        expect(askMapImageNeed).toBe(googledirection.askMapImageNeed);
        userdata = {
            'body': 'yes',
             googledirection: {
                      'origin': 'tambaram',
                      'destination': 'egmore'
              }
         };
         return getDirectionOverview(userdata);
    })
    .fail(function (error) {
         console.log(error);
    });
});