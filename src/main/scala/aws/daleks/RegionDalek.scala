package aws.daleks

import com.amazonaws.regions.Region
import com.amazonaws.AmazonWebServiceClient
import com.amazonaws.auth.AWSCredentialsProvider

case class RegionDalek(implicit val  region: Region) {
  def fly = List(
    S3Dalek(),
    
    CloudFormationDalek(),
    ElasticBeanstalkDalek(),
    
    AutoScalingDalek(),
    
    RDSDalek(),
    
    EC2Dalek()
  ).foreach(_.fly)

  override def toString = region.toString

  
}