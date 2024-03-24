package com.example.Project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Project.Model.CloudVendor;
import com.example.Project.repository.CloudVendorRepository;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

	CloudVendorRepository cloudVendorRepository;
	
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}
	

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		
		cloudVendorRepository.save(cloudVendor);
		
		return "Success" ;
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
	  
		cloudVendorRepository.save(cloudVendor);
		
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		
		 cloudVendorRepository.deleteById(cloudVendorId);
		 
		 return "Success";
		
		
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		
	return	cloudVendorRepository.findById(cloudVendorId).get();
		
		
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		
		return cloudVendorRepository.findAll();
	}

}
