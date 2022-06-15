package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.pe.fj.rest.Posts;
import br.pe.fj.rest.Users;

@RunWith(Suite.class)
@SuiteClasses({
	Users.class,
	Posts.class
})
public class Runner {

}
