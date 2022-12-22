package io.DontGetGot.DontGetGot;

public class Mission {
	private String _id;
	private String _missionText;
	
	public Mission(String id, String missionText) {
		_id = id;
		_missionText = missionText;
	}

  public String getId() {
    return _id;
  }

  public String getMissionText() {
    return _missionText;
  }
}