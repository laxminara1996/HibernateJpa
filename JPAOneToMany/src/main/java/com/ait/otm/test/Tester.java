package com.ait.otm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import com.ait.otm.dao.CategoryDAO;
import com.ait.otm.dao.impl.CategoryDAOImpl;
import com.ait.otm.entities.CategoryEntity;
import com.ait.otm.entities.ProductEntity;

public class Tester {

	public static void main(String[] args) throws Exception {
		
		CategoryDAO dao = new CategoryDAOImpl();
		/*
		 * call saveCategory() method
		 */
		//create CategoryEntity instance
		/*
		CategoryEntity categoryEntity=new CategoryEntity();
		categoryEntity.setCategoryId(12101);
		categoryEntity.setCategoryName("ELECTRONICS");
		
		//create ProductEntity instance-1
		ProductEntity productEntity1 = new ProductEntity();
		productEntity1.setProductId(220989);
		productEntity1.setProductName("Mobile");
		
		File file = new File("D:\\Images\\mobile1.jpg");
		byte[] imageBytes = new byte[(int)file.length()];
		
		FileInputStream fis = new FileInputStream(file);
		fis.read(imageBytes);
		productEntity1.setProductImage(imageBytes);
		
		//create ProductEntity instance-2
		ProductEntity productEntity2 = new ProductEntity();
		productEntity2.setProductId(670832);
		productEntity2.setProductName("Television");
		
		File file2 = new File("D:\\Images\\tv1.jpg");
		byte[] imageBytes_tv = new byte[(int)file2.length()];
		
		FileInputStream fis2 = new FileInputStream(file2);
		fis2.read(imageBytes_tv);
		productEntity2.setProductImage(imageBytes_tv);
		
		//create ProductEntity instance-3
		ProductEntity productEntity3 = new ProductEntity();
		productEntity3.setProductId(721897);
		productEntity3.setProductName("MicroOWven");
		
		File file3 = new File("D:\\Images\\moven.jpg");
		byte[] imageBytes_moven = new byte[(int)file3.length()];
		
		FileInputStream fis3 = new FileInputStream(file3);
		fis3.read(imageBytes_moven);
		productEntity3.setProductImage(imageBytes_moven);
		
		//add ProductEntity instances to Collection.
		List<ProductEntity> lstOfProducts =
			Arrays.asList(productEntity1, productEntity2, productEntity3);
		//set the collection to CategoryEntity instance
		categoryEntity.setLstOfProducts(lstOfProducts);
		
		dao.saveCategory(categoryEntity);
		*/
		
		/*
		 * call fetchCategory()
		 */
		/*
		CategoryEntity cEntity = dao.fetchCategory(12101);
		System.out.println("Category Name  : " + cEntity.getCategoryName());
		List<ProductEntity>  lst = cEntity.getLstOfProducts();
		//read the first element of the list
		ProductEntity pEntity = lst.get(0);
		System.out.println("Product Id : "+ pEntity.getProductId());
		System.out.println("Product Name : " + pEntity.getProductName());
		byte[] bytesOfImage = pEntity.getProductImage();
		File f1 = new File("D:\\ImageFromDB\\mobile_image_FromDB.jpg");
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(bytesOfImage);
		System.out.println("Please check the image at : "+ f1.getAbsolutePath());
		*/
		
		/*
		 * call removeCategory()
		 */
		
		dao.removeCategory(12101);
		
		
		

	}

}
