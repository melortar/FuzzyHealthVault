const express = require('express');
const { exec } = require('child_process');
const bodyParser = require('body-parser');

const app = express();
const port = process.env.PORT || 8080;

const JAVA_PROGRAM_PATH = "./digoxin_java/out/artifacts/digoxin_java_jar/crane_java.jar"
const path = process.env.PATH;


// Middleware for parsing JSON
app.use(bodyParser.json());

// Serve static files from the 'public' directory
app.use(express.static('public'));

// Endpoint to handle running the Java program
app.post('/runJavaProgram', (req, res) => {
    const crcl = req.body.crcl;
    const ibw = req.body.ibw;
    const drug_interactivity = req.body.drugInteractivity;

    // Replace the command with the actual command to run your compiled Java program
    //const command = `java YourJavaProgram ${input1} ${input2}`;
    const command = `java -jar ${JAVA_PROGRAM_PATH} ${crcl} ${ibw} ${drug_interactivity}`;

    exec(command, {env: {PATH: path}}, (error, stdout, stderr) => {
        if (error) {
            res.status(500).json({ error: error.message });
            return;
        }
        res.json({ output: stdout });
    });
});

// Start the server
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
