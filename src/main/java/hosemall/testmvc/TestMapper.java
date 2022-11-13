package hosemall.testmvc;

import hosemall.testmvc.vo.TestObject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface TestMapper {
    TestObject selectHuman();
}
