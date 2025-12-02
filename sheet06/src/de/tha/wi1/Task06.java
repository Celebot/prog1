package de.tha.wi1;

public class Task06 {
	 public static void main(String[] args) {
		 
	        int[] profile = {0, 1, 2, 3, 4, 3, 2, 3, 4, 4, 4, 4, 5, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 2, 3, 4, 4, 5, 4, 5, 6, 5, 4, 3, 2,};
	 
	        int maxH = getMapHeight(profile);
	        drawProfile(profile, getMapHeight(profile));
	    }
	    
	    private static int getMapHeight(int[] profile) {
	 
	        int max = 0;
	 
	        for(int i : profile) {
	            if(i > max) {
	                max = i;
	            }
	        }
	 
	        return max;
	    }
	 
	    private static void drawProfile(int[] profile, int maxH) {
	 
	        char[][] map = new char[maxH][profile.length-1];
	 
	        initMap(map,profile);
	        printMap(map, profile);
	        
	    }
	 
	 
	    private static void initMap(char[][] map,int[] profile) {
	 
	        for (int i = 0; i < map.length; i++) {
	            for (int j = 0; j < map[i].length; j++) {
	                map[i][j] = ' ';
	            }
	        }
	    }
	 
	    private static void printMap(char[][] map, int[] profile) {
	        int maxH = map.length;
	 
	        for (int i = 0; i < map.length; i++) {
	            for (int j = 0 ; j < map[i].length; j++) {
	 
	                if(maxH == profile[j]) {
	                    map[i][j] = getMapSymbol(profile,j);;
	                }
	            }
	            maxH--;
	        }
	 
	        for(char[] i: map) {
	            for(char j: i) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	    
	    private static char getMapSymbol(int[] profile, int charpos) {
	        // TODO Auto-generated method stub
	        
	        if (charpos < 0 || charpos == profile.length - 1) {
	            return ' ';
	        }
	        
	        if (charpos -1 < profile.length && charpos -1 >= 0 && charpos +1 < profile.length) {
	            if (profile[charpos] > profile[charpos-1] && profile[charpos] > profile[charpos+1]) {return '^';}
	            if (profile[charpos] < profile[charpos-1] && profile[charpos] < profile[charpos+1]) {return 'v';}
	            if (profile[charpos] > profile[charpos-1] && profile[charpos] < profile[charpos+1]) {return '/';}
	            if (profile[charpos] < profile[charpos-1] && profile[charpos] > profile[charpos+1]) {return '\\';}
	            if (profile[charpos] == profile[charpos-1] && profile[charpos] == profile[charpos+1]) {return '-';}
	            else {return '-';}
	            }
	        else {return '-';}
	    }

		
}
