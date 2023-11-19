# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

**C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

mainscreen.html - Updated lines 14, 19, 21, 53 in  to reflect my choice for the shop and the products and parts it will contain.

**D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.**

about.html - Created this file, added button back to main screen on line 24.
AboutController.java - Created this file, added dynamic message to appear on about.html on line 12.
mainscreen.html - Added button to travel to about page on line 21.

**E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.**

OutsourcedPart.java - Added a constructor on lines 20-24 to more easily enable the creation of a sample inventory of parts.
BootStrapData.java - Created the 5 products and 5 parts on lines 70-91, also added a check to ensure no duplicate inventory is added on line 68.

**F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:**
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

BuyProductController.java - Created file, lines 18-33 decrement the inventory if possible, and send a GET request to the appropriate method on lines 35-46.
purchasesuccess.html - Created file, the "view" that is shown upon a successful purchase.
purchaseerror.html - Created file, the "view" that is shown if inventory at zero.
BootStrapData.java - Lines 70-90, corrected to use constructors that include ID parameter.
OutSourcedPart.java - Lines 20, 21 corrected to reflect superclass constructor that include ID parameter.

**G.  Modify the parts to track maximum and minimum inventory by doing the following:**
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


**H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:**
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


**I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.**


**J.  Remove the class files for any unused validators in order to clean your code.**

