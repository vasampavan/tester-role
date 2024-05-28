# tester-role

Required Software:

Any integrated development environment(IDE) example: eclipse,IntelliJ.

Chrome driver.

Selenium grid.

Steps to execute the program:

Step 1. SetUp:
   Download all the required software: IDE, selenium grid, chrome driver or any other web browser driver. I used chrome driver.
   create a new folder to maintain the files.
   keep all the softwares in the created folder.
   1. Installing IDE:
      Install the downloaded IDE by following the steps mentioned.
   2. Extracting Chrome Driver:
      Chrome Driver will be downloaded as a zip file. we cannot use the chromedriver if it is in zip file, so extract the downloaded chrome driver zip file.
   3. Set selenium Build Path:
      Open the installed IDE and create a new java project with any name and create a class in the created project.
      Then a new file (class) will be opened in the IDE.
      In the package Explorer, we can find our all the files related to our project. Right click on the class file to set selenium to only that class or rigth click on src folder to set selenium for all the classes in that folder.
      After right click, there is option named Build Path, select Build path then a configure build path option will be visible.
      ![image](https://github.com/vasampavan/tester-role/assets/162179032/7707e357-1e06-47dd-8794-1db98fdf7143)

      Click on configure Build Path, then a new Window will be opened, in that window, there are few options like source, projects, libraries, order and export on the top of the window. click on libraries, then select classpath and select on add External Jars button on the right, then select the selenium grid file and click on apply and close button.
      ![image](https://github.com/vasampavan/tester-role/assets/162179032/38c88684-875d-4bb8-83cf-4716b85dadf2)

      If the selenium setup is successful, selenium server and its version will be available in the referenced libraries section in the package explorer as below:
      ![image](https://github.com/vasampavan/tester-role/assets/162179032/2fdc5faa-24b0-4454-ae0e-0a1c5d81ef39)
      
Step 2:
      Web Driver setup:
      In the main method set the webdriver using system.setProperty method and give 2 parameters where one is "webdriver.chrome.driver" and the another one is the location of the extracted chromedriver executable file.

Step 3:
      Complete the entire code.
      run java file.
      if any errors occurs, rectify them until the successful comilation.
      After succesful compilation, verify the output and compare it with the required output, if any defeats are there, solve those.
      ***
