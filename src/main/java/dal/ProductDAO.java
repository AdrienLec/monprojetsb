/**
 * 
 */
package dal;

import org.springframework.data.jpa.repository.JpaRepository;

import bo.Product;

/**
 * @author adrienlecaplain
 *
 */
public interface ProductDAO extends JpaRepository<Product, Long>{

}
