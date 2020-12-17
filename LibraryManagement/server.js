const express = require('express');
const path = require('path');
const app = express();

app.use(express.static(_dirname + '/dist/LibraryManagement'));
app.get('/*', function(req,res) {
  res.sendFile(path.join(_dirname + '/dist/LibraryManagement/index.html'));
});

app.listen(process.env.PORT || 8080);
}
