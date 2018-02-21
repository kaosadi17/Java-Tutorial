import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Watch {

	public static void main(String[] args) throws IOException {
		
		WatchService watch = FileSystems.getDefault().newWatchService();
		
		Path directory = Paths.get("/home/amalio/");
		
		WatchKey watchkey = directory.register(watch, StandardWatchEventKinds.ENTRY_CREATE,
				StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
		
		while(true){
			for(WatchEvent<?> event: watchkey.pollEvents()){
				System.out.println(event.kind());
				Path file = directory.resolve((Path) event.context());
				System.out.println(file);
			}
		}

	}

	
}
