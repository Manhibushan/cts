const http=require('http');
http.createServer(function(req,res)
{

   res.setHeader('200000',{ 'Content-type' : 'text/html'})


    res.end("<h1>hello world</h1>")

}).listen(2000);
console.log("server is running at 2000")
