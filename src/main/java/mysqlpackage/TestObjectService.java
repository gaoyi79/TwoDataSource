package mysqlpackage;

import java.util.List;

public interface TestObjectService {
	List<TestObject> findAll();
	TestObject findById(Long id);
}
