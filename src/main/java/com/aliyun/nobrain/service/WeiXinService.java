package com.aliyun.nobrain.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.aliyun.nobrain.entity.MessageVO;
import com.aliyun.nobrain.entity.Token;
import com.aliyun.nobrain.entity.User;

@Path("weixin")
public interface WeiXinService {
	/**
	 * GET请求：进行URL、Tocken 认证；
	 * 1. 将token、timestamp、nonce三个参数进行字典序排序
	 * 2. 将三个参数字符串拼接成一个字符串进行sha1加密
	 * 3. 开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
	 */
	@Path("message")
	@GET
	public String doGet(@QueryParam("")Token token);
	/*
    注释（Annotation）：在 javax.ws.rs.* 中定义，是 JAX-RS (JSR 311) 规范的一部分。 
   @Path：定义资源基 URI。由上下文根和主机名组成，资源标识符类似于 http://localhost:8080/RESTful/rest/hello。 
   @GET：这意味着以下方法可以响应 HTTP GET 方法。 
   @Produces：以纯文本方式定义响应内容 MIME 类型。
   
   @Context： 使用该注释注入上下文对象，比如 Request、Response、UriInfo、ServletContext 等。 
   @Path("{contact}")：这是 @Path 注释，与根路径 “/contacts” 结合形成子资源的 URI。 
   @PathParam("contact")：该注释将参数注入方法参数的路径，在本例中就是联系人 id。其他可用的注释有 @FormParam、@QueryParam 等。 
   @Produces：响应支持多个 MIME 类型。在本例和上一个示例中，APPLICATION/XML 将是默认的 MIME 类型。
*/
	
	
	@POST
	@Path("message")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public MessageVO doPost(MessageVO messageVO);
	
	@POST
	@Path("test")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public User test(User user);
}
