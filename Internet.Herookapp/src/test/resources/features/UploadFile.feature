Feature: FileUpload Page
  Tests for the 'http://the-internet.herokuapp.com/upload' home page

  
 Background: Open FileUpload page
    Given I have navigated to the 'the-internet' "file upload" page

    Scenario Outline: Verify that the upload file is done
    When I chose a <file>
    And I clicked on Upload
    Then the file name should be displayed after uploading the file
    
    Examples:
    
    |file|
    |C:\Users\stoufa\Desktop\NeverLoseHope\RHOUMA_Ghada.pdf|
    
    Scenario Outline: Verify that the upload of txt file is done correctely
    When I chose a <file>
    And I clicked on Upload
    Then the file name should be same displayed and the txt extension should be shown
    
    Examples:
    |file|
    |C:\Users\stoufa\Desktop\NeverLoseHope\LM.txt|
    
    Scenario Outline: Verify that the upload of pdf file is done correctely
    When I chose a <file>
    And I clicked on Upload
    Then the file name should be same displayed and the pdf extension should be shown
    
    Examples:
    |file|
    |C:\Users\stoufa\Desktop\NeverLoseHope\RHOUMA_Ghada.pdf|
    