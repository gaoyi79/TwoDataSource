package mysqlpackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestObjectServiceImpl implements TestObjectService {

	@Autowired
	TestObjectRepository objRepository;
	
	public List<TestObject> findAll() {
		return (List<TestObject>) objRepository.findAll();
	}

	public TestObject findById(Long id) {
		return objRepository.findOne(id);
	}

}
