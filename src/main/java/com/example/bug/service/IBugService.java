// package com.example.bug.service;

// import java.util.List;
// import java.util.Optional;

// import com.example.bug.common.ResponseModel;
// import com.example.bug.model.Bug;

// import jakarta.validation.Valid;

// public interface IBugService{

//     ResponseModel createBug(@Valid Bug model);

//     List<Bug> getAllBugs();
    
//     List<Bug> getBugsByStatus(String status);

//     List<Bug> getBugsByPriority(String priority);

//     List<Bug> getBugsByAssignedTo(String userId);

//     Bug getBugById(String id);
    
//     Bug updateBug(String id, Bug bug);

//     void deleteBug(String id);

//     void assignBug(String bugId, String userId);

//     Bug updateBugStatus(String id, String status);
// }