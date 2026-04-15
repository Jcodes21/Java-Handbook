## Starting a project with intellij ce

Go to the spring initialiser: https://start.spring.io/
select Maven
add the "mvc (springboot) dependency
Click generate to download the skeleton project
extract the zip folder and place the extraction in a good location
Launch intellij and click "open", select your project to import it into intelli j
when your project is loaded, click the maven panel on the right in the UI
Expand: your project, Lifecycle
click the prohibition symbol in the menu to skip tests
use cmd to select both, package and clean, then click the run (play symbol)
in the terminal you should see maven has built the application and created a .jar file
To run the application run the main class in intellij or 
you should see in the terminal that the webserver has started on port 8080
add the following code to a new class file in our current package called HomeController:

package YOUR-PKG-NAME;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "App is running!";
        }
    }


THEN go to http://localhost:8080
