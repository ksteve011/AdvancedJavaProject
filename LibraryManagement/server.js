const express = require('express');
const path = require('path');
const app = express();

app.use(express.static(_dirname + '/dist/LibraryManagement'));
app.get('/*', function(req,res) {
  res.sendFile(path.join(_dirname + '/dist/LibraryManagement/index.html'));
});

app.listen(process.env.PORT || 8080);
}

var express = require('express')
var cors = require('cors')
var app = express()

app.use(cors())

app.get('/products/:id', function (req, res, next) {
  res.json({msg: 'This is CORS-enabled for all origins!'})
})

app.listen(80, function () {
  console.log('CORS-enabled web server listening on port 80')
})
