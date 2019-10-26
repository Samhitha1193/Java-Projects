
public class MainClass {
	
	public static void main() {
		

		
		public static final String YES = "Yes";
		
		public static final String ORACLE = "Oracle";
		
		public static final String MY_SQL = "MySql";
		
		static final Runtime runTime = Runtime.
		   getRuntime();
		
		static final String rootPath = "C:/Users/Joy/CustomFramework/GitFolder/";
		
		static final String homePath = "C:/Users/Joy/CustomFramework/";
		
		
		
		public static void main(String args[]) throws IOException, ParserConfigurationException, SAXException, TransformerFactoryConfigurationError, TransformerException, ParseException {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Do you want to create a Spring Boot Application?(Yes/No)");
			
			String springResponse = sc.next();
			
			String appName = "springbasic";
			
			
			//if yes
			
			if(YES.equalsIgnoreCase(springResponse)) {
				
				/*
				 * System.out.println("Application Name?");
				 * 
				 * appName = sc.next();
				 */
				
				
				System.out.println("Which build tool you want to use? Maven?(Yes/No)");
				
				String buildToolResponse = sc.next();
				
				if(YES.equalsIgnoreCase(buildToolResponse)) {
					
					try {
						
					
						//Build a basic Spring Boot application with  Maven
						
						
						  Map<String,String> params = new HashMap<String, String>();
						  
						  params.put("AppName",appName);
						  
						  
						/*
						 * System.out.println("Group ID"); String groupId = sc.next();
						 * 
						 * 
						 * System.out.println("Version"); String version = sc.next();
						 * 
						 * params.put("grpId", groupId); params.put("artId", appName);
						 * params.put("version", version);
						 */
						
					//	buildSpringStarter(params);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}		
				
			}else {
				
			//if No
				
				
			}	
			
			
			//Database 
			
			System.out.println("Which backend you want to use?(MySql)");
			
			String dbResponse = sc.next();
			
			if(MY_SQL.equalsIgnoreCase(dbResponse)) {
				
				System.out.println("Enter url");
				
				String url = sc.next();
				
				
	            System.out.println("Enter username");
				
				String username = sc.next();
				
				
	            System.out.println("Enter password");
				
				String password = sc.next();
				
				
	            System.out.println("Enter service name");
				
				String serviceName = sc.next();
				
				
				/*
				 * createDatabaseConnection(url, username, password, serviceName, appName);
				 * 
				 * editProp(appName);
				 * 
				 * startApplication(appName);
				 * 
				 * showEndPoint();
				 */
				
				enableMavenLogging();
				
			//	enableMavenSwagger();
				
				//enableMavenJavaParser();
				
			//	generateCrudOperations();
				
				
				
			}
			
		}//end of main
		
		
		private static void buildSpringStarter(Map<String,String> parameters){
			
			//build the basic starter spring application
					
			try {
				runTime.
				   exec("cmd /c start "+rootPath+"BatchFiles/clone.bat "+parameters.get("AppName"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
		}
		
		
		
		private static void createDatabaseConnection(String url, String username, String password, String serviceName, String appName) {
			
			//add the properties to application.properties file in the application
			
			try(OutputStream out = new FileOutputStream(rootPath+appName+"/src/main/resources/application.properties")){
			
			Properties prop = new Properties();
			
			StringBuilder sb = new StringBuilder("");
			
			sb.append("jdbc:mysql://");
			
			prop.setProperty("spring.datasource.url",sb.toString()+url+":3306/"+serviceName);
			prop.setProperty("spring.datasource.username", username);
			prop.setProperty("spring.datasource.password", password);
		//	prop.setProperty("spring.datasource.driver-class-name", "oracle.jdbc.driver.OracleDriver");
		//	prop.setProperty("spring.jpa.properties.hibernate.dialect", "org.hibernate.dialect.OracleDialect");
			
			prop.setProperty("spring.jpa.properties.hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
			
			
			prop.store(out, null);
			
			}catch(Exception e) {
				
			}
			
			
		}
		
		
		private static void editProp(String appName) throws IOException {
			
			MyUtility.editProp(new File(rootPath+appName+"/src/main/resources/application.properties"), appName);
			
		}	

		  private static void startApplication(String appName) { 
			  
			  
			  try { 
				  runTime.exec("cmd /c start "+rootPath+"BatchFiles/startApp.bat "+appName); 
				  
			  } catch(IOException e) 
			  
			  {
				    e.printStackTrace(); 
				  } 
			  }
		 
			
		
		private static void showEndPoint() {
			
			try {
				runTime.
				   exec("cmd /c start "+rootPath+"BatchFiles/showEndPoint.bat");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		private static void enableMavenLogging() throws ParserConfigurationException, SAXException, IOException, TransformerFactoryConfigurationError, TransformerException, ParseException {
			
			MyUtility.addLogDependency();
		
		}
		
		
		private static void enableMavenSwagger() throws ParserConfigurationException, IOException, SAXException, TransformerFactoryConfigurationError, TransformerException {
			
			MyUtility.addSwaggerDependency();
		}
		
		private static void enableMavenJavaParser() throws
		  ParserConfigurationException, IOException, SAXException,
		  TransformerFactoryConfigurationError, TransformerException {
		  
		  MyUtility.addJavaParserDependency();
		}
		
		 
		
		private static void generateCrudOperations() {
			
			
		}

	}

}
