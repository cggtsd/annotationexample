package cgg.annotations.annotationexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcClientAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import cgg.annotations.annotationexample.config.MyConfigValues;
import cgg.annotations.annotationexample.service.CategoryService;
import cgg.annotations.annotationexample.service.ProductService;

@SpringBootApplication()
@ComponentScan(basePackages={"cgg.working","cgg.annotations.annotationexample"})
public class AnnotationexampleApplication  implements CommandLineRunner{

	@Autowired
	private MyConfigValues values;
	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(AnnotationexampleApplication.class, args);
		ProductService productBean = container.getBean(ProductService.class);
		System.out.println(productBean);
		productBean.createProduct();

		CategoryService bean = container.getBean(CategoryService.class);
		System.out.println(bean);
		bean.getProductService().createProduct();
		bean.getCartService().addToCart();
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(values.getAppName());
		System.out.println(values.getAppPort());
		System.out.println(values.getAppDb());
	}

}
