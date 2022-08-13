public class PostFactory {
    public static Post createPost(String type){
        switch (type){
            case "blog":
                return new BlogPost();
            case "product":
                return new ProductPost();
            case "news":
                return new NewsPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }
}
