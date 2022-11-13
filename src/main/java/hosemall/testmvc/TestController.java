package hosemall.testmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
    private final Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public ModelAndView printHello() {
        ModelAndView mav = new ModelAndView("hello");
        
        log.info("시발시발시발");
        
        return mav;
    }

    @GetMapping("/human")
    public String getHuman() {
        return testService.getHuman().getName();
    }
}
