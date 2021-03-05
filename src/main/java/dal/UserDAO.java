/**
 * 
 */
package dal;

import org.springframework.data.jpa.repository.JpaRepository;

import bo.User;

/**
 * @author adrienlecaplain
 *
 */
public interface UserDAO extends JpaRepository<User, Long> {

}
