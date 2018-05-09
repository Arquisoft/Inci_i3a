### Load test

For load test Gatling is used which you can download [here](https://gatling.io/download/)`.

In order to run Gatling go to bin folder and execute the following command.

For unix:
```sh
./gatling.sh
```
For windows:
```sh
./gatling.bat
```
Then in the prompt select whichever simulations you want to perform.

In order to create the simulation in scala, in a new browser tab press F12(or Fn+F2), go to the Network tab, and select the 'Preserve Log' checkbox. 
Next, go to the target web page and perform the actions that need to be tested(login, check incidents, etc).
Once this is done, right click on the actions that have been recorded by the browser, select 'Save as HAR with content' and then import it to Gatling in order to transform it to a scala file that can be used to make the simulations. 

Alternatively, you can run our [self-crafted script](https://gist.github.com/ByBordex/8308a6a16345a6484eea09909200dbfb) it will execute every simulation in the simulations folder. 

To run it give execution rigths to it an execute: 
```sh
./multiGatling.sh
```
In windows system you may substitute .sh extension to .bat, replace it in the filename and inside the script. (Not Tested)

