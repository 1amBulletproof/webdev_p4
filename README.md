# webdev_p4
Add a socket component to webdev_p4

Beartooth Hiking Company has decided that they would also like to provide rate quotes as a socket service in addition to the Web-start solution. For this homework, you are to modify your last homework to connect to a socket server to get the quote information instead of using the Rates and BookingDay classes.

The BHC server will be on <the class computer>:20025 (128.220.101.240:20025). It expects data in the form of hike_id:begin_year:begin_month:begin_day:duration (e.g: 1:2008:7:1:3)

Gardiner Lake is hike_id 0, with durations of 3 or 5 days

Hellroaring Plateu is hike_id 1, with durations of 2, 3, or 4 days

Beaten Path is hike_id 2, with durations of 5 or 7 days

January is month 1, and the years are in four digits, and all values are separated by ":"s

The returned result will be the cost followed by a ":", followed by some text. If things go well, you'll get the cost and the text "Quoted Rate", if there is a problem, the cost will by -0.01 and the text will have some explanation. You will need to parse the return results and display them in your GUI. You are not responsible for the logic of the rate quote, as the server will handle it. All you are doing is designing the GUI client and then displaying the results from the server.

You should use a Java app solution (executable jar) solution for this application that is uploaded to the Blackboard server.
