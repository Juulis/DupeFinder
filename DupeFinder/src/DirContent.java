import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class DirContent {
	
	public static List<String> getContent(File dir){
	
	List<String> flist = new ArrayList<String>();
	
	for(File f : dir.listFiles()){
		if (f.isFile())
			flist.add(f.getName().toString());
		else { flist.add(f.getName().toString());
			for (File fsub : f.listFiles()){
				if (fsub.isFile())
						flist.add(fsub.getName().toString());
				else { flist.add(fsub.getName().toString());
					for (File fsub2 : fsub.listFiles()){	
						if (fsub2.isFile())
							flist.add(fsub2.getName().toString());
						else { flist.add(fsub2.getName().toString());
							for (File fsub3 : fsub2.listFiles()){	
								if (fsub3.isFile())
									flist.add(fsub3.getName().toString());
								else { flist.add(fsub3.getName().toString());
									for (File fsub4 : fsub3.listFiles()){
										if (fsub4.isFile())
											flist.add(fsub4.getName().toString());
										else { flist.add(fsub4.getName().toString());
											for (File fsub5 : fsub4.listFiles()){
												if (fsub.isFile())
													flist.add(fsub5.getName().toString());
												else { 
													flist.add(fsub5.getName().toString());
												}
												
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	return flist;
	
	
	}
	
}
