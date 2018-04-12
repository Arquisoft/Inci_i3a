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

Alternatively, you can run our [self-crafted script](https://gist.github.com/ByBordex/8308a6a16345a6484eea09909200dbfb) it will execute every simulation in the simulations folder. 

To run it give execution rigths to it an execute: 
```sh
./multiGatling.sh
```
In windows system you may substitute .sh extension to .bat, replace it in the filename and inside the script. (Not Tested)
