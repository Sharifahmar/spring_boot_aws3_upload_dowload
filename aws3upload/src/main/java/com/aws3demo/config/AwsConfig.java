/**
 * 
 */
package com.aws3demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 * @author Ahmar
 *
 */
@Configuration
public class AwsConfig {

	@Value("${aws.credentials.accessKey}")
	private String accessKey;

	@Value("${aws.credentials.secretKey}")
	private String secretKey;

	@Value("${aws.region}")
	private String region;

	@Value("${aws.s3.bucket}")
	private String bucket;

	public String getAccessKey() {
		return accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public String getRegion() {
		return region;
	}

	public String getBucket() {
		return bucket;
	}

	@Bean
	public BasicAWSCredentials basicAWSCredentials() {
		return new BasicAWSCredentials(accessKey, secretKey);
	}

	@Bean
	public AmazonS3 amazonS3(AWSCredentials awsCredentials) {
		AmazonS3 amazonS3 = AmazonS3ClientBuilder
				.standard()
				.withRegion(Regions.fromName(region))
				.withCredentials(
						new AWSStaticCredentialsProvider(basicAWSCredentials()))
				.build();

		return amazonS3;
	}
}
