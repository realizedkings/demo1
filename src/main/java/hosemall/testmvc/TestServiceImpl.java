package hosemall.testmvc;

import hosemall.testmvc.vo.TestObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    private final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);
    @Autowired
    private TestMapper testMapper;

    @Override
    public TestObject getHuman() {
        return testMapper.selectHuman();
    }
}
