package _04_jeopardy_api.data_transfer_objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Anime {

@SerializedName("anime")
@Expose
private String anime;
@SerializedName("character")
@Expose
private String character;
@SerializedName("quote")
@Expose
private String quote;

public String getAnime() {
return anime;
}

public void setAnime(String anime) {
this.anime = anime;
}

public String getCharacter() {
return character;
}

public void setCharacter(String character) {
this.character = character;
}

public String getQuote() {
return quote;
}

public void setQuote(String quote) {
this.quote = quote;
}

}