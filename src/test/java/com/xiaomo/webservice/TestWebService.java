package com.xiaomo.webservice;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

import org.junit.Test;
import org.w3c.dom.Document;

public class TestWebService {
	
	/*
	 public void testGetUserFromWsdl() throws MalformedURLException, Exception { 
		Client client = new Client(new URL("http:// 10.45.1.143:6802/PrimaryService?wsdl")); //
		String jksqm="781A0900217040815818EEEB87FEC7ED9A819F8BCAEDAB2C0EDC6BD";//接口授权码
    	String jkid="01003";//接口id
    	String imgstring=GetImageStr("待比对图片.jpg");//通过base64把图片转码
    	String socore="0.88";//比对阀值
    	int iMaxCount =10;//返回结果数量
    	StringBuffer xmlStr=new StringBuffer();//xml格式的参数
    	xmlStr.append("<?xml version='1.0'?><root><QueryCondition>");
    	xmlStr.append("<imgStr>" + imgstring + "</imgStr>");
    	xmlStr.append("<fScore>" + socore + "</fScore>");
    	xmlStr.append("<iMaxCount>" + iMaxCount + "</iMaxCount>");
    	xmlStr.append("</QueryCondition></root>");
    	//System.out.println(xmlStr.toString());
		Object[] results = client.invoke("queryObjectOut", 
				new Object[] {jksqm,jkid,xmlStr.toString()}); //返回结果xml格式的字符
		System.out.println("results:" + results[0]); 
}
 
 public class HelloService {

	public  String queryObjectOut( 
			String xtlb
			,String jkxlh
			,String jkid
			,String yhbz
			,String dwmc
			,String dwjgdm
			,String yhxm
			,String zdbs
			){
		
		System.out.println( String.format("xtlb= %s,jkxlh = %s, jkid = %s, yhbz = %s, dwmc = %s, dwjgdm = %s, yhxm = %s, zdbs = %s"
				,xtlb
				,jkxlh
				,jkid
				,yhbz
				,dwmc
				,dwjgdm
				,yhxm
				,zdbs
				)); 
		return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n<root>\n<head>\n<code>1</code>\n<message>%E6%95%B0%E6%8D%AE%E4%B8%8B%E8%BD%BD%E6%88%90%E5%8A%9F%EF%BC%81</message>\n<rownum>1</rownum>\n</head>\n<body>\n<veh id=\"0\">\n  <xh>44070009408284</xh>\n  <hpzl>02</hpzl>\n  <hphm>J97220</hphm>\n  <clpp1>%E9%AA%90%E8%BE%BE%E7%89%8C</clpp1>\n  <clxh>DFL7161BB</clxh>\n  <clpp2>TIIDA</clpp2>\n  <gcjk>A</gcjk>\n  <zzg>156</zzg>\n  <zzcmc>%E4%B8%9C%E9%A3%8E%E6%B1%BD%E8%BD%A6%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8</zzcmc>\n  <clsbdh>LGBG22E059Y217547</clsbdh>\n  <fdjh>600074C</fdjh>\n  <cllx>K33</cllx>\n  <csys>B</csys>\n  <syxz>A</syxz>\n  <sfzmhm>440701197107100019</sfzmhm>\n  <sfzmmc>A</sfzmmc>\n  <syr>%E6%9E%97%E8%80%80%E4%BA%AE</syr>\n  <ccdjrq>2009-11-27+13%3A59%3A57.0</ccdjrq>\n  <djrq>2016-10-14+17%3A05%3A44.0</djrq>\n  <yxqz>2017-11-30+00%3A00%3A00.0</yxqz>\n  <qzbfqz>2099-12-31+00%3A00%3A00.0</qzbfqz>\n  <fzjg>%E7%B2%A4J</fzjg>\n  <glbm>440700000400</glbm>\n  <bxzzrq>2016-11-24+00%3A00%3A00.0</bxzzrq>\n  <dabh>440700039515</dabh>\n  <zt>A</zt>\n  <dybj>0</dybj>\n  <fdjxh>HR16</fdjxh>\n  <rlzl>A</rlzl>\n  <pl>1598</pl>\n  <gl>80</gl>\n  <zxxs>1</zxxs>\n  <cwkc>4250</cwkc>\n  <cwkk>1695</cwkk>\n  <cwkg>1535</cwkg>\n  <hxnbcd></hxnbcd>\n  <hxnbkd></hxnbkd>\n  <hxnbgd></hxnbgd>\n  <gbthps></gbthps>\n  <zs>2</zs>\n  <zj>2600</zj>\n  <qlj>1480</qlj>\n  <hlj>1485</hlj>\n  <ltgg>185%2F65R15</ltgg>\n  <lts>4</lts>\n  <zzl>1630</zzl>\n  <zbzl>1182</zbzl>\n  <hdzzl></hdzzl>\n  <hdzk>5</hdzk>\n  <zqyzl></zqyzl>\n  <qpzk></qpzk>\n  <hpzk></hpzk>\n  <hbdbqk>GB18352.3-2005%E5%9B%BD%E2%85%A2</hbdbqk>\n  <ccrq>2009-11-22+00%3A00%3A00.0</ccrq>\n  <clyt>P1</clyt>\n  <ytsx>9</ytsx>\n  <xszbh>4430019224318</xszbh>\n  <jyhgbzbh>174407362020</jyhgbzbh>\n</veh>\n</body>\n</root>";
	}
	
}
 
	 
	 */
	
	@Test
	public void test() throws Exception{
		 // {*} * 为图片中的数字  
        String ns = "http://service.xiaomo.com";  // {1}  
        String wsdlUrl = "http://localhost:8080/WebServiceTest/services/HelloService?wsdl";  // {2}  
        //1、创建服务(Service)    
        URL url = new URL(wsdlUrl);    
        QName sname = new QName(ns, "HelloService"); // {3}  
        Service service = Service.create(url, sname);  
                            
        //2、创建Dispatch    
        Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(ns, "HelloServiceHttpSoap11Endpoint"), SOAPMessage.class, Service.Mode.MESSAGE); // {4}    
                        
        //3、创建SOAPMessage    
        SOAPMessage msg = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createMessage();    
        SOAPEnvelope envelope = msg.getSOAPPart().getEnvelope();    
        SOAPBody body = envelope.getBody();    
                        
        //4、创建QName来指定消息中传递数据    
        QName ename = new QName(ns, "queryObjectOut", "ser");//<nn:add xmlns="xx"/>  // {5}  
        SOAPBodyElement ele = body.addBodyElement(ename);    
        // 传递参数    
        // {6}  
        ele.addChildElement("xtlb", "ser").setValue("151****3701");      
        ele.addChildElement("jkxlh", "ser").setValue("测试!");      
        msg.writeTo(System.out);    
        System.out.println("\n invoking.....");    
                                
        //5、通过Dispatch传递消息,会返回响应消息    
        SOAPMessage response = dispatch.invoke(msg);    
//        response.writeTo(System.out);    
        System.out.println();    
                        
        //6、响应消息处理,将响应的消息转换为dom对象    
        Document doc = response.getSOAPPart().getEnvelope().getBody().extractContentAsDocument();    
        String str = doc.getElementsByTagName("ns:return").item(0).getTextContent();  // {7}  
        System.out.println(str);    
	}

}
