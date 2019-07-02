/*
  specify which libraries to load: 
    In the Governance Tier configuration file, 
    these should be configurations common across 
    all apps governed by this config. 
*/

application_environments {
  dev {
    long_name = "Development"
  }
}
libraries{
  //merge = true 
  dotnet

}
