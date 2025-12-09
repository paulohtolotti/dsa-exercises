package entities;

public class VideoLesson {

        private String id;
        private String title;
        private String duration;

        public VideoLesson(String id, String title, String duration) {
            this.id = id;
            this.title = title;
            this.duration = duration;
        }

        public String getId() {
            return this.id;
        }
 
        public String getTitle() {
            String formattedTitle = this.title.replaceAll(".mp4", "");
            formattedTitle = formattedTitle.replaceAll("^\\d{2}-\\d{2}", "").trim();
            return formattedTitle;
        }

        public int getDuration() {
            return Integer.parseInt(duration);
        }

        /**
         * 
         * @return Objeto VideoLesson em formato JSON, formatado com as tabulações
         * e quebras de linha.
         */
        public String toJsoString() {

            StringBuilder sb = new StringBuilder();
            sb.append("\n\t{\n");
            sb.append("\t\t\"id\":");
            sb.append("\"" + this.getId() + "\"");
            sb.append(",\n");
            sb.append("\t\t\"title\":");
            sb.append("\"" + this.getTitle() + "\"");
            sb.append(",\n");
            sb.append("\t\t\"duration\":");
            sb.append(this.getDuration());
            sb.append("\n\t}");

            return sb.toString();
        }

}
