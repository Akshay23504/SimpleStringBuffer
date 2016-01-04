# SimpleStringBuffer
A Simple Implementation of Java StringBuffer with append and toString methods

# Example

    public void append(String stringToAppend) {
        if (stringToAppend.length() > 0) {
            int lastPosition = this.content.length;
            this.content = Arrays.copyOf(this.content, lastPosition
                    + stringToAppend.length());
            for (int i = lastPosition; i < content.length; i++) {
                this.content[i] = stringToAppend.charAt(i - lastPosition);
            }
        }
      
# Pre-requisites

Intellij IDEA or Eclipse IDE


